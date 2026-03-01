-- Resetar o ambiente
DROP TABLE IF EXISTS partitura;

-- Criar a tabela
CREATE TABLE partitura (
                           id            BIGSERIAL    PRIMARY KEY,
                           titulo        VARCHAR(255) NOT NULL,
                           autor         VARCHAR(255) NOT NULL,
                           arranjador    VARCHAR(255) NOT NULL,
                           bpm           INTEGER      CHECK (bpm > 0),
                           tonalidade    VARCHAR(10)  NOT NULL,
                           avaliacao     INTEGER      CHECK (avaliacao >= 1 AND avaliacao <= 5),
                           data_criacao  TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,

-- Validação das siglas de tonalidade
    CONSTRAINT check_tonalidade_sigla CHECK (tonalidade IN (
                                                           'C', 'C#', 'D', 'D#', 'E', 'F', 'F#', 'G', 'G#', 'A', 'A#', 'B',
                                                           'Cm', 'C#m', 'Dm', 'D#m', 'Em', 'Fm', 'F#m', 'Gm', 'G#m', 'Am', 'A#m', 'Bm'
    ))
);