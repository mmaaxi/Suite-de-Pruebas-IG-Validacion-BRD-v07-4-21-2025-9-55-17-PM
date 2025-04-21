Feature: Validar navegación entre módulos

  Scenario: El usuario inicia sesión y navega entre módulos
    Given el usuario esta en la pagina de inicio de sesión
    When el usuario inicia sesión con credenciales válidas
    Then el usuario debe ingresar correctamente al sistema

    When el usuario navega al módulo "Dashboard"
    Then el módulo "Dashboard" debe cargar correctamente 

    When el usuario navega al módulo "Reportes"
    Then el módulo "Reportes" debe cargar correctamente