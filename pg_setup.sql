CREATE TABLE
  cars (
    id UUID,
    name varchar(255),
    brand varchar(255),
    about varchar(255),
    period varchar(255),
    price numeric NOT NULL,
    fuel_type varchar(255),
    thumbnail varchar(255),
    created_at timestamp NOT NULL DEFAULT (now()),
    updated_at timestamp NOT NULL DEFAULT (now())
  );

create table accessories (id UUID, car_id UUID, type varchar(255), name varchar(255));
create table photos (id UUID, car_id UUID, photo varchar(255));

insert into cars (about, brand, created_at, fuel_type, id, name, period, price, thumbnail, updated_at) values 
    ('O carro ainda tem sistema de tração nas quatro rodas Quattro com diferencial traseiro esportivo de série. De acordo com a Audi, ele faz o mesmo em 3,8 segundos na Sportback.', 'Audi', CURRENT_TIMESTAMP, 'electric_motor', '535e8de8-721b-4bac-8b72-7d29be7da467', 'RS 5 Coupé', 'Ao dia', 120, 'https://storage.googleapis.com/golden-wind/ignite/react-native/thumbnails/1.png', CURRENT_TIMESTAMP),
    ('O Panamera é um automóvel de luxo coupé com porte grande. Tem motorização dianteira V6 e V8. A tração é integral com uma caixa PDK de sete mudanças e dupla embreagem.', 'Porsche', CURRENT_TIMESTAMP, 'gasoline_motor', 'ffb71f55-818a-48b1-b7d2-2efc406ede25', 'Carro do Batman', 'Ao dia', 340, 'https://storage.googleapis.com/golden-wind/ignite/react-native/thumbnails/2.png', CURRENT_TIMESTAMP),
    ('O Chevrolet Corvette Z06 inclui freios Brembo de alto desempenho com pinças maiores no conjunto dianteiro, itens aerodinâmicos com capô de fibra de carbono, suspensão para alto desempenho.', 'Chevrolet', CURRENT_TIMESTAMP, 'gasoline_motor', '52930821-cbea-4b05-9f45-7c02b1bb0d8c', 'Camaro Amarelo', 'Ao dia', 620, 'https://storage.googleapis.com/golden-wind/ignite/react-native/thumbnails/3.png', CURRENT_TIMESTAMP),
    ('Este é automóvel desportivo. Surgiu do lendário touro de lide indultado na praça Real Maestranza de Sevilla. É um belíssimo carro para quem gosta de acelerar.', 'Lamborghini', CURRENT_TIMESTAMP, 'electric_motor', '49983f6c-a46a-4dfd-a86e-425b8c72e086', 'Huracan', 'Ao dia', 120, 'https://storage.googleapis.com/golden-wind/ignite/react-native/thumbnails/4.png', '2022-03-12 12:43:53'),
    ('A Poderosa Combinação de um Motor Elétrico de Alto Desempenho e um Motor a Combustão. Compacto e Inovador. Com Design Expressivo, Tecnologias Intuitivas e Estilo Urbano.', 'volvo', CURRENT_TIMESTAMP, 'gasoline_motor', '508e7193-0078-4615-9071-920b59038fda', 'XC40', 'Ao dia', 120, 'https://storage.googleapis.com/golden-wind/ignite/react-native/thumbnails/5.png', CURRENT_TIMESTAMP),
    ('Mitsubishi Lancer é um belo e agressivo carro. Além do mais, ele encanta pelo conforto e pela eficiência. Bastante firme e estável para dirigir com tranquilidade e segurança.', 'mitsubishi', CURRENT_TIMESTAMP, 'hybrid_motor', '59626707-88c5-4877-9350-07f372c0905a', 'Lancer', 'Ao dia', 220, 'https://storage.googleapis.com/golden-wind/ignite/react-native/thumbnails/6.png', CURRENT_TIMESTAMP);

 INSERT INTO accessories (id, car_id, type, name) values 
      (gen_random_uuid(), '535e8de8-721b-4bac-8b72-7d29be7da467', 'speed', '250km/h'),
      (gen_random_uuid(), '535e8de8-721b-4bac-8b72-7d29be7da467', 'acceleration', '3.8s'),
      (gen_random_uuid(), '535e8de8-721b-4bac-8b72-7d29be7da467', 'turning_diameter', '800 HP'),
      (gen_random_uuid(), '535e8de8-721b-4bac-8b72-7d29be7da467', 'electric_motor', 'Elétrico'),
      (gen_random_uuid(), '535e8de8-721b-4bac-8b72-7d29be7da467', 'exchange', 'Auto'),
      (gen_random_uuid(), '535e8de8-721b-4bac-8b72-7d29be7da467', 'seats', '5 pessoas'),
      (gen_random_uuid(), 'ffb71f55-818a-48b1-b7d2-2efc406ede25', 'speed', '315km/h'),
      (gen_random_uuid(), 'ffb71f55-818a-48b1-b7d2-2efc406ede25', 'acceleration', '2.9s'),
      (gen_random_uuid(), 'ffb71f55-818a-48b1-b7d2-2efc406ede25', 'turning_diameter', '700 HP'),
      (gen_random_uuid(), 'ffb71f55-818a-48b1-b7d2-2efc406ede25', 'gasoline_motor', 'Gasoline'),
      (gen_random_uuid(), 'ffb71f55-818a-48b1-b7d2-2efc406ede25', 'exchange', 'Auto'),
      (gen_random_uuid(), 'ffb71f55-818a-48b1-b7d2-2efc406ede25', 'seats', '4 pessoas'),
      (gen_random_uuid(), '52930821-cbea-4b05-9f45-7c02b1bb0d8c', 'speed', '330km/h'),
      (gen_random_uuid(), '52930821-cbea-4b05-9f45-7c02b1bb0d8c', 'acceleration', '6.2s'),
      (gen_random_uuid(), '52930821-cbea-4b05-9f45-7c02b1bb0d8c', 'turning_diameter', '900 HP'),
      (gen_random_uuid(), '52930821-cbea-4b05-9f45-7c02b1bb0d8c', 'gasoline_motor', 'Gasoline'),
      (gen_random_uuid(), '52930821-cbea-4b05-9f45-7c02b1bb0d8c', 'exchange', 'Auto'),
      (gen_random_uuid(), '52930821-cbea-4b05-9f45-7c02b1bb0d8c', 'seats', '2 pessoas'),
      (gen_random_uuid(), '49983f6c-a46a-4dfd-a86e-425b8c72e086', 'speed', '380km/h'),
      (gen_random_uuid(), '49983f6c-a46a-4dfd-a86e-425b8c72e086', 'acceleration', '3.2s'),
      (gen_random_uuid(), '49983f6c-a46a-4dfd-a86e-425b8c72e086', 'turning_diameter', '800 HP'),
      (gen_random_uuid(), '49983f6c-a46a-4dfd-a86e-425b8c72e086', 'electric_motor', 'Elétrico'),
      (gen_random_uuid(), '49983f6c-a46a-4dfd-a86e-425b8c72e086', 'exchange', 'Auto'),
      (gen_random_uuid(), '49983f6c-a46a-4dfd-a86e-425b8c72e086', 'seats', '2 pessoas'),
      (gen_random_uuid(), '508e7193-0078-4615-9071-920b59038fda', 'speed', '180km/h'),
      (gen_random_uuid(), '508e7193-0078-4615-9071-920b59038fda', 'acceleration', '1.5s'),
      (gen_random_uuid(), '508e7193-0078-4615-9071-920b59038fda', 'turning_diameter', '600 HP'),
      (gen_random_uuid(), '508e7193-0078-4615-9071-920b59038fda', 'gasoline_motor', 'Gasolina'),
      (gen_random_uuid(), '508e7193-0078-4615-9071-920b59038fda', 'exchange', 'Auto'),
      (gen_random_uuid(), '508e7193-0078-4615-9071-920b59038fda', 'seats', '5 pessoas'),
      (gen_random_uuid(), '59626707-88c5-4877-9350-07f372c0905a', 'speed', '180km/h'),
      (gen_random_uuid(), '59626707-88c5-4877-9350-07f372c0905a', 'acceleration', '2.0s'),
      (gen_random_uuid(), '59626707-88c5-4877-9350-07f372c0905a', 'turning_diameter', '600 HP'),
      (gen_random_uuid(), '59626707-88c5-4877-9350-07f372c0905a', 'hybrid_motor', 'Híbrido'),
      (gen_random_uuid(), '59626707-88c5-4877-9350-07f372c0905a', 'exchange', 'Auto'),
      (gen_random_uuid(), '59626707-88c5-4877-9350-07f372c0905a', 'seats', '5 pessoas');
      
  
  INSERT INTO photos (id, car_id, photo) VALUES
      (gen_random_uuid(), '535e8de8-721b-4bac-8b72-7d29be7da467', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/1.png'),
      (gen_random_uuid(), '535e8de8-721b-4bac-8b72-7d29be7da467', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/2.png'),
      (gen_random_uuid(), '535e8de8-721b-4bac-8b72-7d29be7da467', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/3.png'),
      (gen_random_uuid(), 'ffb71f55-818a-48b1-b7d2-2efc406ede25', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/4.png'),
      (gen_random_uuid(), 'ffb71f55-818a-48b1-b7d2-2efc406ede25', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/5.png'),
      (gen_random_uuid(), '52930821-cbea-4b05-9f45-7c02b1bb0d8c', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/6.png'),
      (gen_random_uuid(), '52930821-cbea-4b05-9f45-7c02b1bb0d8c', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/7.png'),
      (gen_random_uuid(), '52930821-cbea-4b05-9f45-7c02b1bb0d8c', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/8.png'),
      (gen_random_uuid(), '49983f6c-a46a-4dfd-a86e-425b8c72e086', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/9.png'),
      (gen_random_uuid(), '49983f6c-a46a-4dfd-a86e-425b8c72e086', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/10.png'),
      (gen_random_uuid(), '49983f6c-a46a-4dfd-a86e-425b8c72e086', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/11.png'),
      (gen_random_uuid(), '508e7193-0078-4615-9071-920b59038fda', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/12.png'),
      (gen_random_uuid(), '508e7193-0078-4615-9071-920b59038fda', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/13.png'),
      (gen_random_uuid(), '508e7193-0078-4615-9071-920b59038fda', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/14.png'),
      (gen_random_uuid(), '59626707-88c5-4877-9350-07f372c0905a', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/15.png'),
      (gen_random_uuid(), '59626707-88c5-4877-9350-07f372c0905a', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/16.png'),
      (gen_random_uuid(), '59626707-88c5-4877-9350-07f372c0905a', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/17.png');