SAUCE DEMO - E2E AUTOMATION WITH SERENITY BDD

Tecnologías / versiones usadas:
- Java 17 (JDK 17)
- Maven 3.9+
- Serenity BDD 4.2.34
- JUnit 5 (5.9.3)
- Selenium Java 4.10.0
- WebDriverManager 5.4.4 (opcional, para gestión de drivers)
- Navegador: Google Chrome (asegúrate que la versión del chromedriver coincida o usa WebDriverManager)

Estructura del proyecto:
- pom.xml
- serenity.properties
- src/test/java/com/saucedemo/pages  -> PageObjects
- src/test/java/com/saucedemo/tests  -> Test clases
- README.txt
- conclusiones.txt

Pasos para ejecutar localmente:
1. Descomprime el ZIP y abre la carpeta en tu IDE (IntelliJ recomendado).
2. Asegúrate de tener JAVA_HOME apuntando a JDK 17 y Maven instalado.
3. Opcional: si no quieres instalar chromedriver manualmente, el proyecto usa WebDriverManager.
4. Ejecuta desde la raíz del proyecto:
   mvn test -Dwebdriver.driver=chrome
5. Los reportes de Serenity se generan en: target/site/serenity

Notas adicionales:
- Si prefieres ejecutar en otro navegador, ajusta 'webdriver.driver' en serenity.properties.
- Si WebDriverManager no funciona por restricción de red, instala chromedriver y colócalo en el PATH.
