# Constructor
## 🧱 Comparación de visibilidades (muy importante)

```java
public Persona() { }       // Desde cualquier sitio 🌍 
protected Persona() { }    // Paquete + herencia 🧬 
Persona() { }              // SOLO mismo paquete 📦 
private Persona() { }      // SOLO dentro de la clase 🔒
```

Lo normal es tenerlo en `public`
