package com.nt.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
//@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter

public class BookDetails {
private Integer bId;

private String bCode;

private String bName;

private String bAuthor;

private float bPrice;

private Integer bQty;

private String status;
}
