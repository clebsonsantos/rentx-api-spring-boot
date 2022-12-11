-- CREATE DATABASE rentx;

insert into cars (about, brand, created_at, fuel_type, id, name, period, price, thumbnail, updated_at) values 
    ('O carro ainda tem sistema de tração nas quatro rodas Quattro com diferencial traseiro esportivo de série. De acordo com a Audi, ele faz o mesmo em 3,8 segundos na Sportback.', 'Audi', CURRENT_TIMESTAMP, 'electric_motor', '535e8de8-721b-4bac-8b72-7d29be7da467', 'RS 5 Coupé', 'Ao dia', 120, 'https://storage.googleapis.com/golden-wind/ignite/react-native/thumbnails/1.png', CURRENT_TIMESTAMP),
    ('O Panamera é um automóvel de luxo coupé com porte grande. Tem motorização dianteira V6 e V8. A tração é integral com uma caixa PDK de sete mudanças e dupla embreagem.', 'Porsche', CURRENT_TIMESTAMP, 'gasoline_motor', 'ffb71f55-818a-48b1-b7d2-2efc406ede25', 'Carro do Batman', 'Ao dia', 340, 'https://storage.googleapis.com/golden-wind/ignite/react-native/thumbnails/2.png', CURRENT_TIMESTAMP),
    ('O Chevrolet Corvette Z06 inclui freios Brembo de alto desempenho com pinças maiores no conjunto dianteiro, itens aerodinâmicos com capô de fibra de carbono, suspensão para alto desempenho.', 'Chevrolet', CURRENT_TIMESTAMP, 'gasoline_motor', '52930821-cbea-4b05-9f45-7c02b1bb0d8c', 'Camaro Amarelo', 'Ao dia', 620, 'https://storage.googleapis.com/golden-wind/ignite/react-native/thumbnails/3.png', CURRENT_TIMESTAMP),
    ('Este é automóvel desportivo. Surgiu do lendário touro de lide indultado na praça Real Maestranza de Sevilla. É um belíssimo carro para quem gosta de acelerar.', 'Lamborghini', CURRENT_TIMESTAMP, 'electric_motor', '49983f6c-a46a-4dfd-a86e-425b8c72e086', 'Huracan', 'Ao dia', 120, 'https://storage.googleapis.com/golden-wind/ignite/react-native/thumbnails/4.png', CURRENT_TIMESTAMP),
    ('A Poderosa Combinação de um Motor Elétrico de Alto Desempenho e um Motor a Combustão. Compacto e Inovador. Com Design Expressivo, Tecnologias Intuitivas e Estilo Urbano.', 'volvo', CURRENT_TIMESTAMP, 'gasoline_motor', '508e7193-0078-4615-9071-920b59038fda', 'XC40', 'Ao dia', 120, 'https://storage.googleapis.com/golden-wind/ignite/react-native/thumbnails/5.png', CURRENT_TIMESTAMP),
    ('Mitsubishi Lancer é um belo e agressivo carro. Além do mais, ele encanta pelo conforto e pela eficiência. Bastante firme e estável para dirigir com tranquilidade e segurança.', 'mitsubishi', CURRENT_TIMESTAMP, 'hybrid_motor', '59626707-88c5-4877-9350-07f372c0905a', 'Lancer', 'Ao dia', 220, 'https://storage.googleapis.com/golden-wind/ignite/react-native/thumbnails/6.png', CURRENT_TIMESTAMP);

insert into accessories (id, name, type) values 
('c445e2e8-2ea9-4067-b6d8-4b820cb7a3f9', '250km/h', 'speed'),
 ('eb3e322d-0b62-4da5-9c1f-b7d53d1611f4', '3.8s', 'acceleration'),
 ('43186bc3-e9bd-462b-9f2a-9af20784974c', '800 HP', 'turning_diameter'),
 ('9719595c-0e5d-42f7-a8fd-8bc5fc2956f5', 'Elétrico', 'electric_motor'),
 ('bd60f1f3-058c-441c-8865-00a626aa86fb', 'Auto', 'exchange'),
 ('730c2c23-bac7-41d0-a829-b8d8c5ec3c74', '5 pessoas', 'seats'),
 ('aa8afdbe-0150-48ab-9f54-9d048629a4b1', '315km/h', 'speed'),
 ('a4dd7897-6197-40e1-a4ae-37f71cc7041e', '2.9s', 'acceleration'),
 ('58ce4030-1252-4535-ac84-6aa68f59f96d', '700 HP', 'turning_diameter'),
 ('f3fec67e-60ad-4f60-b90e-5a7b64af96e2', 'Gasoline', 'gasoline_motor'),
 ('dc08514e-3015-4a4a-9e7a-36bfa2f4287f', 'Auto', 'exchange'),
 ('5a2267df-0095-442a-80e7-fa7f7104f7c6', '4 pessoas', 'seats'),
 ('9fa17077-d39a-40a6-9f5a-0845bc87615d', '330km/h', 'speed'),
 ('13685c56-798b-4a3c-9fdb-e54e48bc6704', '6.2s', 'acceleration'),
 ('4f00b4bb-211b-4320-b845-bfb1e6356196', '900 HP', 'turning_diameter'),
 ('32ac0c0c-7d1b-473d-8086-e58e85dcf782', 'Gasoline', 'gasoline_motor'),
 ('bb4b6e37-6909-40ba-bd9d-85c4af9f475b', 'Auto', 'exchange'),
 ('947bf67c-7d40-4882-bd42-678f526f6cb3', '2 pessoas', 'seats'),
 ('f610d3b5-4b51-4260-b84e-7b5a667d0b91', '380km/h', 'speed'),
 ('ff4c0da5-63fd-4b94-9361-91dce0362b85', '3.2s', 'acceleration'),
 ('8de5cb67-b28f-429f-92bb-09470510115d', '800 HP', 'turning_diameter'),
 ('61468a62-2cf9-4d34-8854-eaaee139534d', 'Elétrico', 'electric_motor'),
 ('a1365e20-654b-4e32-b857-ddbc2d35f08d', 'Auto', 'exchange'),
 ('58c4d4ff-4815-4aaa-95a6-a1d709b314f1', '2 pessoas', 'seats'),
 ('87e0aea7-8ab5-4cc2-a086-c1f5120900a9', '180km/h', 'speed'),
 ('c860c9b1-fb25-40e6-9b41-efb51f00cbf6', '1.5s', 'acceleration'),
 ('42e3515b-f0bb-44dd-8fbe-1cd4f8948c78', '600 HP', 'turning_diameter'),
 ('a466eb40-5696-4d0a-a136-6da406e05530', 'Gasolina', 'gasoline_motor'),
 ('bdafb350-6179-4153-88b8-c36e8351ca06', 'Auto', 'exchange'),
 ('e26c8139-967e-42d5-8485-a2006021caf1', '5 pessoas', 'seats'),
 ('36de0d83-e6bb-4061-9a2d-f2c411971c06', '180km/h', 'speed'),
 ('043adbcd-feb8-46bb-8e57-073800c7a510', '2.0s', 'acceleration'),
 ('e39620b8-f69c-4f0f-87e4-44f1c4e99c13', '600 HP', 'turning_diameter'),
 ('b4f35320-cfaf-49b5-95d3-ea0535b4b792', 'Híbrido', 'hybrid_motor'),
 ('30852019-877e-445c-ab21-fe7598d81367', 'Auto', 'exchange'),
 ('a835844c-e7f3-492f-86e2-8ec26251da5b', '5 pessoas', 'seats');
      
  
INSERT INTO photos (id, photo) VALUES
  ('38ea722f-5296-4cd8-a00f-d5341c538a2e', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/1.png'),
  ('a460270e-0c0c-4757-ba96-c146a39d19c9', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/2.png'),
  ('69345831-4e44-45d4-8eb2-71a88348f117', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/3.png'),
  ('9bb292a0-dd88-494f-8073-dd20815e0e86', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/4.png'),
  ('06a7a2d3-5fb5-49eb-8fba-49141a2dca0b', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/5.png'),
  ('a66597ac-ad90-49f0-8cfa-be85f9d285b2', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/6.png'),
  ('af7dbe5d-e2dd-49a1-a036-57fa963093fd', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/7.png'),
  ('824b0e28-3a09-4bb8-a917-186ccdc85779', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/8.png'),
  ('0f7ef48b-b447-43fc-b776-be39d08b9451', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/9.png'),
  ('a6a3038d-81b5-449a-921e-3e9a13cd5a0e', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/10.png'),
  ('404d9db0-fa8a-46db-936f-f20eb7f6503f', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/11.png'),
  ('c1fd3b4c-8414-4f23-9a65-c15dbcfee230', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/12.png'),
  ('3a146128-76a4-4c14-83fc-6a070b0f6fe6', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/13.png'),
  ('5bbeb780-b61e-400b-b071-5b03d6f639ae', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/14.png'),
  ('8d8a64a9-3c17-4f21-ac67-ac29065519ca', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/15.png'),
  ('eae2d4ea-ccaa-42bd-aec8-935101d5a8f3', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/16.png'),
  ('d3d43188-89b2-43bc-b17c-c0a10e300128', 'https://storage.googleapis.com/golden-wind/ignite/react-native/images/17.png');

insert into cars_accessories (car_id, accessorie_id) values
('49983f6c-a46a-4dfd-a86e-425b8c72e086', '03b97309-c7e7-438f-ae69-80e786f4f414'),
('ffb71f55-818a-48b1-b7d2-2efc406ede25', 'e39620b8-f69c-4f0f-87e4-44f1c4e99c13'),
('52930821-cbea-4b05-9f45-7c02b1bb0d8c', '8de5cb67-b28f-429f-92bb-09470510115d'),
('535e8de8-721b-4bac-8b72-7d29be7da467', '61468a62-2cf9-4d34-8854-eaaee139534d'),
('508e7193-0078-4615-9071-920b59038fda', 'a1365e20-654b-4e32-b857-ddbc2d35f08d'),
('59626707-88c5-4877-9350-07f372c0905a', '58c4d4ff-4815-4aaa-95a6-a1d709b314f1');

insert into cars_photos (car_id, photo_id) values
('49983f6c-a46a-4dfd-a86e-425b8c72e086', '38ea722f-5296-4cd8-a00f-d5341c538a2e'),
('ffb71f55-818a-48b1-b7d2-2efc406ede25', '3a146128-76a4-4c14-83fc-6a070b0f6fe6'),
('52930821-cbea-4b05-9f45-7c02b1bb0d8c', '404d9db0-fa8a-46db-936f-f20eb7f6503f'),
('535e8de8-721b-4bac-8b72-7d29be7da467', 'c1fd3b4c-8414-4f23-9a65-c15dbcfee230'),
('508e7193-0078-4615-9071-920b59038fda', '3a146128-76a4-4c14-83fc-6a070b0f6fe6'),
('59626707-88c5-4877-9350-07f372c0905a', '5bbeb780-b61e-400b-b071-5b03d6f639ae');