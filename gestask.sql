CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo_electronico VARCHAR(100) UNIQUE NOT NULL,
    contrasena VARCHAR(255) NOT NULL,
    rol ENUM('administrador', 'usuario') NOT NULL
);
 
CREATE TABLE tareas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_tarea VARCHAR(255) NOT NULL,
    descripcion TEXT,
    estado ENUM('pendiente', 'en progreso', 'completada') NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_vencimiento DATE NOT NULL,
    id_usuario INT,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id) ON DELETE SET NULL
);
 
CREATE TABLE comentarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    texto TEXT NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    id_tarea INT,
    id_usuario INT,
    FOREIGN KEY (id_tarea) REFERENCES tareas(id) ON DELETE CASCADE,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id) ON DELETE CASCADE
);
 
CREATE TABLE historial (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_tarea INT,
    nombre_tarea VARCHAR(255),
    descripcion TEXT,
    estado ENUM('pendiente', 'en progreso', 'completada'),
    fecha_inicio DATE,
    fecha_vencimiento DATE,
    fecha_entrega DATE,
    id_usuario INT,
    FOREIGN KEY (id_tarea) REFERENCES tareas(id) ON DELETE CASCADE,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id) ON DELETE CASCADE
);
 
