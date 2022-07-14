package br.univille.dacs2022.mapper;

import java.util.List;
import br.univille.dacs2022.dto.PacienteDTO;
import br.univille.dacs2022.entity.Paciente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PacienteMapper {

    List<PacienteDTO> mapListPaciente(List<Paciente> paciente);

    List<Paciente> mapListPacienteDTO(List<PacienteDTO> paciente);

    PacienteDTO mapPaciente(Paciente paciente);

    Paciente mapPacienteDTO(PacienteDTO paciente);

}
