Feature: Validar seguridad del sistema - Acceso no autorizado

  Scenario: Intentar acceder a áreas restringidas sin iniciar sesión
    Given el usuario no ha iniciado sesión
    When el usuario intenta acceder a una página restringida
    Then el sistema redirige a la página de login

  Scenario: Ingresar URL directa de módulos protegidos
    Given el usuario no ha iniciado sesión
    When el usuario ingresa la URL directa de un módulo protegido
    Then se muestra un mensaje de error o se redirige a la autenticación