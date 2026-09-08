DROP DATABASE IntegraClub;

CREATE DATABASE IntegraClub;

USE IntegraClub;


-- Tabela Usuario --

CREATE TABLE usuario(
	id_usuario INT NOT NULL UNIQUE PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    telefone VARCHAR(20),
    criado_em DATETIME
);

-- Tabela Instituicao --

CREATE TABLE instituicao(
	id_instituicao INT NOT NULL UNIQUE PRIMARY KEY,
    cnpj VARCHAR(18) NOT NULL UNIQUE,
    email VARCHAR(150) NOT NULL UNIQUE, 
    descricao TEXT NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    site_link VARCHAR(150) NOT NULL,
    logo_link VARCHAR(150),
    logradouro VARCHAR(200) NOT NULL,
    numero VARCHAR(20) NOT NULL,
    bairro VARCHAR(80) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    estado VARCHAR(2) NOT NULL,
    cep VARCHAR(9) NOT NULL,
    latitude DECIMAL(10,7) NOT NULL,
    longitude DECIMAL(10,7) NOT NULL,
    verificada TINYINT(1) NOT NULL,
    ativa TINYINT(1) NOT NULL,
    criado_em DATETIME
);

-- Tabela de administrador --

CREATE TABLE administrador(
	id_admin INT NOT NULL UNIQUE PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    email VARCHAR(150) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    criado_em DATETIME
);

-- Tabela avaliacao --

CREATE TABLE avaliacao(
	id_avaliacao INT NOT NULL UNIQUE PRIMARY KEY,
	nota TINYINT NOT NULL,
    comentario TEXT,
    criado_em DATETIME,
    id_usuario INT,
    id_instituicao INT,
    FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY(id_instituicao) REFERENCES instituicao(id_instituicao)
);

-- Tabela de report à avaliações --

CREATE TABLE report_avaliacao(
	id_report_avaliacao INT NOT NULL UNIQUE PRIMARY KEY,
    motivo VARCHAR(255) NOT NULL,
    criado_em DATETIME,
    id_avaliacao INT,
    id_usuario INT,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY (id_avaliacao) REFERENCES avaliacao(id_avaliacao)
);

-- Tabela de denúncia às instituição --

CREATE TABLE denuncia(
	id_denuncia INT NOT NULL UNIQUE PRIMARY KEY,
    motivo VARCHAR(255) NOT NULL,
    status VARCHAR(20) NOT NULL,
    resposta TEXT,
    criado_em DATETIME,
    avaliada_em DATETIME,
    id_usuario INT,
    id_instituicao INT,
    id_admin INT,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY(id_instituicao) REFERENCES instituicao(id_instituicao),
    FOREIGN KEY(id_admin) REFERENCES administrador(id_admin)
);

-- Tabela de pedido de verificação --

CREATE TABLE pedido_verificacao(
	id_pedido_verificacao INT NOT NULL UNIQUE PRIMARY KEY,
    status VARCHAR(20) NOT NULL,
    observacao TEXT,
	criado_em DATETIME,
    avaliada_em DATETIME,
    id_instituicao INT,
	id_admin INT,
    FOREIGN KEY(id_instituicao) REFERENCES instituicao(id_instituicao),
    FOREIGN KEY(id_admin) REFERENCES administrador(id_admin)
);

-- Tabela foto de instituição --

CREATE TABLE inst_foto(
	id_inst_foto INT NOT NULL UNIQUE PRIMARY KEY,
    url VARCHAR(255) NOT NULL,
    criado_em DATETIME,
    id_instituicao INT,
    FOREIGN KEY(id_instituicao) REFERENCES instituicao(id_instituicao)
);

-- Tabela para mensagem de justificativa a resposta --

CREATE TABLE mensagem_justificativa(
	id_mensagem_justificativa INT NOT NULL UNIQUE PRIMARY KEY,
    assunto VARCHAR(200) NOT NULL,
    corpo TEXT,
    criada_em DATETIME,
    id_admin INT,
    id_instituicao INT,
    id_denuncia INT,
    id_pedido_verificacao INT,
    FOREIGN KEY(id_admin) REFERENCES administrador(id_admin),
    FOREIGN KEY(id_instituicao) REFERENCES instituicao(id_instituicao),
    FOREIGN KEY(id_denuncia) REFERENCES denuncia(id_denuncia),
    FOREIGN KEY(id_pedido_verificacao) REFERENCES pedido_verificacao(id_pedido_verificacao)
);

