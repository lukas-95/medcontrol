package br.com.medcontrol.service;

import br.com.medcontrol.model.Cirurgia;
import br.com.medcontrol.model.Paciente;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class CirurgiaService {


    private br.com.medcontrol.model.Paciente Paciente;

    public List<Cirurgia> getCirurgias(){
        Cirurgia[] crg = new Cirurgia[3];
// passar um array list de de cirurgioes.

        crg[0] = new Cirurgia(, Paciente, LocalDate.now(),
                "Panturrilha Podre");

    }
}
