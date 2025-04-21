Feature: Validar compatibilidad del sistema en diferentes navegadores

  Scenario: Acceso al sistema y verificación en diferentes navegadores
    Given estoy usando el navegador "Chrome"
    When accedo al sistema
    Then el sistema se visualiza correctamente y todas las funcionalidades operan de manera uniforme

    Given estoy usando el navegador "Firefox"
    When accedo al sistema
    Then el sistema se visualiza correctamente y todas las funcionalidades operan de manera uniforme

    Given estoy usando el navegador "Edge"
    When accedo al sistema
    Then el sistema se visualiza correctamente y todas las funcionalidades operan de manera uniforme

    Given estoy usando el navegador "Safari"
    When accedo al sistema
    Then el sistema se visualiza correctamente y todas las funcionalidades operan de manera uniforme

  Scenario: Interacción con componentes del sistema en diferentes navegadores
    Given estoy usando el navegador "Chrome"
    When interactúo con los componentes del sistema
    Then no se presentan errores o fallos de funcionalidad

    Given estoy usando el navegador "Firefox"
    When interactúo con los componentes del sistema
    Then no se presentan errores o fallos de funcionalidad

    Given estoy usando el navegador "Edge"
    When interactúo con los componentes del sistema
    Then no se presentan errores o fallos de funcionalidad

    Given estoy usando el navegador "Safari"
    When interactúo con los componentes del sistema
    Then no se presentan errores o fallos de funcionalidad