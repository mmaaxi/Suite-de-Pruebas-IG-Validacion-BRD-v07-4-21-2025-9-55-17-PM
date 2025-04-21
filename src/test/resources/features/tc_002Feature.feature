Feature: Validar inicio de sesión con credenciales incorrectas

  Scenario: Usuario ingresa credenciales incorrectas para iniciar sesión
    Given El usuario está en la página de inicio de sesión
    When El usuario ingresa un nombre de usuario válido y contraseña incorrecta
    And El usuario hace clic en el botón 'Iniciar sesión'
    Then El sistema muestra un mensaje de error indicando credenciales inválidas