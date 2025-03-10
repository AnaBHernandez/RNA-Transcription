
# RNA Transcription

## Descripción

Este proyecto en Java realiza la transcripción de una secuencia de ADN a su correspondiente secuencia de ARN. La transcripción implica reemplazar cada nucleótido de ADN por su complemento de ARN.

## Reglas de Complementación

- G (Guanina) -> C (Citosina)
- C (Citosina) -> G (Guanina)
- T (Timina) -> A (Adenina)
- A (Adenina) -> U (Uracilo)

## Funcionalidad

La clase `TranscriptorADN` tiene un método `transcribe` que toma un carácter de ADN como entrada y devuelve su complemento de ARN.

### Ejemplo de Uso:

```java
TranscriptorADN transcriptor = new TranscriptorADN();
String resultado = transcriptor.transcribe("G");  // Resultado: "C"
```

## Tests

Este proyecto incluye pruebas unitarias utilizando JUnit 5 para validar la transcripción de bases de ADN a ARN.

### Pruebas implementadas:

1. Transcripción de **Guanina a Citosina**.
2. Transcripción de **Citosina a Guanina**.
3. Transcripción de **Adenina a Uracilo**.
4. Transcripción de **Timina a Adenina**.

## Requisitos

- Java 11 o superior
- JUnit 5 para pruebas unitarias

## Instalación

1. Clona este repositorio:

   ```bash
   git clone https://github.com/AnaBHernandez/RNA-Transcription.git
   ```

2. Navega a la carpeta del proyecto:

   ```bash
   cd RNA-Transcription
   ```

3. Compila y ejecuta el proyecto usando tu IDE favorito o desde la línea de comandos con Maven o Gradle.

## Autor

Ana BHernandez
