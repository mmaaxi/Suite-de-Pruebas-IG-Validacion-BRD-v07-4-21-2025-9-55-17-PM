Feature: Validar cierre de sesión

  Scenario: El usuario debe poder cerrar sesión y ser redirigido a la página de inicio
    Given el usuario ha iniciado sesión con credenciales válidas
    When el usuario hace clic en la opción 'Cerrar sesión'
    Then el usuario debe ser redirigido a la página de inicio

  Scenario: El usuario no debe poder acceder a páginas internas sin estar autenticado
    When el usuario intenta acceder a una página interna
    Then el sistema debe redirigir al usuario a la pantalla de login