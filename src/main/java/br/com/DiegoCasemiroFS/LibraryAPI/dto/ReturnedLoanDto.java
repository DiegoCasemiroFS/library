package br.com.DiegoCasemiroFS.LibraryAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReturnedLoanDto {
    
    private Boolean returned;
    
}
