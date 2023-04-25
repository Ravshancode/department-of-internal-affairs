package uz.internal_affairs.dto.citizen_cotegory;

import lombok.Getter;
import lombok.Setter;
import uz.internal_affairs.dto.FileDto;

@Getter
@Setter
public class CaughtWantedCitizenDto extends BaseCitizenDto{  // Ushlangan qidiruvdagilar

    private Long regionId;                // mahalla id
    private String locationInformation;   // joy xaqida tuliq malumot
    private FileDto fingerprintFile;      // barmoq izi
    private FileDto imageDto;             // rasm
    private String imageUrl;
    private String fingerprintUrl;
    private String employeeSummary;       // hodim Xulosasi
    private String regionAddress;



}