package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PoliticalParty {
private Integer partyId;
private String flagColors;
private String partyName;
private String partySymbol;

}
