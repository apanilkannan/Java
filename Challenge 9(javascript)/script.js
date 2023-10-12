document.addEventListener("DOMContentLoaded", function() {
    const usernameInput = document.getElementById("username");
    const emailInput = document.getElementById("email");
    const passwordInput = document.getElementById("password");
    const passwordCheckInput = document.getElementById("password-check");

    usernameInput.addEventListener("blur", function() {
        checkField(usernameInput, "Username cannot be blank.");
    });

    emailInput.addEventListener("blur", function() {
        checkEmailField(emailInput);
    });

    passwordInput.addEventListener("blur", function() {
        checkField(passwordInput, "Password cannot be blank.");
    });

    passwordCheckInput.addEventListener("blur", function() {
        checkPasswordMatch(passwordCheckInput, passwordInput);
    });

    function checkEmailField(field) {
        const emailValue = field.value.trim();
        if (emailValue === "") {
            displayError(field, "Email cannot be blank.");
        } else if (isValidEmail(emailValue)) {
            highlightField(field, "green");
        } else {
            displayError(field, "Email is not in a valid format.");
        }
    }

    function checkPasswordMatch(field, passwordField) {
        if (field.value.trim() === "") {
            displayError(field, "Confirm Password cannot be blank.");
        } else if (field.value === passwordField.value) {
            highlightField(field, "green");
        } else {
            displayError(field, "Password and Confirm Password do not match.");
        }
    }

    function isValidEmail(email) {
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return emailRegex.test(email);
    }

    function checkField(field, errorMessage) {
        const trimmedValue = field.value.trim();
        if (trimmedValue === "") {
            displayError(field, errorMessage);
        } else {
            highlightField(field, "green");
        }
    }

    function displayError(field, errorMessage) {
        const errorParagraph = document.createElement("p");
        errorParagraph.innerText = errorMessage;
        errorParagraph.className = "error-message";
        field.parentNode.appendChild(errorParagraph);
        field.style.borderColor = "red";
    }

    function highlightField(field, color) {
        const errorMessages = field.parentNode.getElementsByClassName("error-message");
        for (const errorMessage of errorMessages) {
            errorMessage.remove();
        }
        field.style.borderColor = color;
    }
});
