package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorrowBook {
    private long id;
    private long borrowId;
    private List<Long> books;
    private Date date;
    private double fine;
}
