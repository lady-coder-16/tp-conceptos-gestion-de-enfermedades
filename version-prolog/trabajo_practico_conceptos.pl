% enfermedades
enfermedades(hepatitis).
enfermedades(sida).
enfermedades(dengue).
enfermedades(covid).
enfermedades(cancer_de_mama).
enfermedades(diabetes).
enfermedades(asma).
enfermedades(epoc).

% sintomas de cancer_de_mama
sintomas(bultos, cancer_de_mama).
sintomas(inflamacion, cancer_de_mama).
sintomas(hundimiento, cancer_de_mama).
sintomas(dolor, cancer_de_mama).

% sintomas de diabetes
sintomas(bultos, diabetes).
sintomas(inflamacion, diabetes).
sintomas(hundimiento, diabetes).
sintomas(dolor, diabetes).

% sintomas de asma
sintomas(tos, asma).
sintomas(falta_de_respiracion, asma).
sintomas(dolor_en_pecho, asma).
sintomas(silbidos_al_respirar, asma).

% sintomas de epoc
sintomas(tos, asma).
sintomas(falta_de_respiracion, asma).
sintomas(presion_en_pecho, asma).
sintomas(silbidos_al_respirar, asma).

%sintomas de hepatitis
sintomas(fiebre, hepatitis).
sintomas(orina_oscura, hepatitis).
sintomas(dolor_articulacion, hepatitis).
sintomas(nauseas_o_vomitos, hepatitis).

%sintomas de sida
sintomas(diarrea, sida).
sintomas(perdida_de_peso, sida).
sintomas(erupcion, sida).
sintomas(dolor_muscular, sida).

%sintomas de dengue
sintomas(salpullido, dengue).
sintomas(dolor_muscular, dengue).
sintomas(dolor_en_los_ojos, dengue).
sintomas(fiebre, dengue).

%sintomas de covid
sintomas(dolor_garganta, covid).
sintomas(fiebre, covid).
sintomas(tos, covid).
sintomas(perdida_gusto_olfato, covid).

% enfermedades contagiosas
contagioso(hepatitis).
contagioso(sida).
contagioso(dengue).
contagioso(covid).

% enfermedades no contagiosas
no_es_contagioso(cancer_de_mama).
no_es_contagioso(diabetes).
no_es_contagioso(asma).
no_es_contagioso(epoc).

%pertenece a enfermedad contagiosa o no contagiosa
tipos_de_enfermedades(contagioso).
tipos_de_enfermedades(no_es_contagioso).