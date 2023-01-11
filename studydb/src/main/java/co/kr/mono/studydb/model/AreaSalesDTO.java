package co.kr.mono.studydb.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Data = @Getter, @Setter, @RequireArgsConstructor,@NoArgsConstructor,@AllArgsConstructor,@ToString

public class AreaSalesDTO { //변수명은 xml과 맞춰야 한다

    private String areaCd;
    private String regionArea;
    private String prodId;
    private int saleCnt;

    private String name;
    private String cls;
    private Float score;
    //여기(DTO) 내용을 토대로 띄워진다
}
