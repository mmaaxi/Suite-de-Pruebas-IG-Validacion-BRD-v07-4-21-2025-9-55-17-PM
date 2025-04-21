Feature: Validar inicio de sesión con credenciales correctas

  Scenario: Usuario inicia sesión con credenciales válidas
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa nombre de usuario "usuarioValido" en el campo de usuario
    And el usuario ingresa contraseña "contraseñaValida" en el campo correspondiente
    And el usuario hace clic en el botón 'Iniciar sesión'
    Then el usuario es redirigido a la página principal