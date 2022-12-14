package com.amr.project.model.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id", scope = Long.class)
public class CouponDto {
    private Long id;
    private LocalDateTime start;

    @Future(message = "Дата окончания должна быть позднее текущей даты")
    private LocalDateTime end;

    @Min(value=0, message = "Скидка должна быть болльше 0")
    private int discount;

    private String name;
    private Long userId;
    private Long shopId;
}
