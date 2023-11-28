# parameta_proof
API Rest and Web Soap for Parameta Proof

## Funcionamiento
Este proyecto cuenta con dos componentes. El primero, un servicio web SOAP que permite almacenar en una base de datos SQL, mediante el jdbc de MYSQL, a los empleados que se vayan enviando. El segundo, una API REST que se conecta al servicio mencionado anteriormente para alamcenar a un empleado en específico.

## Pasos de ejecución
- Para poder ejecutarlo se debe ejecutar el servicio Web SOAP para establecer conexión mediante la API REST. Dicho servicio web se va a exponer en el puerto 8081.
- Posteriormente se debe ejecutar la API REST y probar el servicio de almacenamiento de empleados. Dicha API REST se va a exponer en el puerto 9090.
