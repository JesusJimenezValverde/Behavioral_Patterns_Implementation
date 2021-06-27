# Behavioral_Patterns_Implementation
Console program that implements Command and Mediator, Behavioral Design Patterns, built as part of a test in the Software Design course at ITCR.
The problems given to be solved were the following (Spanish):

* ## Caso 1 
Dentro de sus metas a corto plazo está volverse ingeniero en computación en un plazo no mayor a dos años, por lo cual, usted ya tiene planes de comprar un automóvil en el primer año de graduado y debe acondicionar su casa de habitación (o negociar con sus familiares) para hacer la remodelación necesaria y contar con un nuevo garaje en el que pueda guardar su vehículo. Como parte del plan, ha decidido poner en práctica todo su conocimiento e implementar un dispositivo que le permita tener acceso a este sitio, y aprovechando, desarrollar otras características que le ofrezcan una serie de beneficios, pues es un hecho que va a pasar bastante tiempo admirando y cuidando su próxima adquisición.

Por lo que ha incluirá en el nuevo garaje un sistema de ventilación (podría ser unos ventiladores o talvez un sistema de AC, tal vez ambos), juegos de luces adicionales a la estándar por si debe revisar algo del vehículo con detenimiento, por ejemplo en la parte inferior del vehículo, manipular un parlante que se conecte por bluetooth pero que se opere a distancia, entre otros y por supuesto, el sistema de manejo de la puerta del garaje que le permita ingresar a él o salir sin abandonar su vehículo.

Ya ha hecho los contactos con quién se requiera para el diseño físico de este dispositivo que le permitirá vía programación configurar los servicios que se dispondrán y el mecanismo para activar o desactivar cada uno de ellos considerando que en ciertos servicios se debe manipular o graduar las intensidades de funcionamiento de dicho servicio, por ejemplo, subir o bajar el volumen de la música, la intensidad de las luces, la temperatura del AC o la velocidad del ventilador, la manipulación de la puerta del garaje, por ejemplo.

* ## Caso 2
Caso 2 
Struts es un framework para construir aplicaciones web Java basadas en la filosofía MVC. Para conocer detalles de este framework se puede consultar: http://www.jtech.ua.es/j2ee/publico/struts-2010-11/sesion01-struts-apuntes.html
Este framework trabaja con una clase llamada ActionServlet, que lee un archivo de configuración (struts-config.xml) a través del cual se gestiona el proceso de control del flujo de información entre todos los componentes web de la aplicación.
 
Si al movernos de una página a otra no vamos a realizar ninguna operación, sino que únicamente estamos navegando, se puede colocar un enlace al .jsp o .html directamente. No obstante, “esto va contra la filosofía de MVC”, en la que todas las peticiones pasan por el controlador. 
Esto porque además en este framework, bajo la filosofía MVC, el controlador puede verificar automáticamente los permisos de acceso, de modo que en muchos casos será vital que todas las peticiones pasen por el controlador.

La forma más sencilla de conseguirlo en Struts es a través del atributo forward de la etiqueta <action>
<action path="/registroNuevoUsuario" forward="/registro.jsp">    </action>
De esta manera, la petición a la URL registroNuevoUsuario.do, se redirige a la página registro.jsp pero pasando antes por el controlador.

