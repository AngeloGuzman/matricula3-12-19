package unibe.edu.ec.matricula.dtos;

import unibe.edu.ec.matricula.entities.Parallel;

public class ParallelDto {
    private int id;

    private String name;

    public ParallelDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ParallelDto(){}
    public ParallelDto(Parallel parallel){

    }
}
