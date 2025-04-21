Feature: Recuperación de contraseña
  Como usuario registrado
  Quiero recuperar mi contraseña
  Para poder acceder nuevamente al sistema

  Scenario: Validar función de recuperación de contraseña
    Given que estoy en la página de inicio de sesión
    When hago clic en el enlace 'Olvidé mi contraseña'
    Then el sistema redirige a la página de recuperación de contraseña
    When ingreso un correo electrónico registrado "usuario@example.com"
    Then el sistema acepta el correo y muestra un mensaje de confirmación
    When hago clic en el botón 'Enviar'
    Then el sistema envía un email de recuperación