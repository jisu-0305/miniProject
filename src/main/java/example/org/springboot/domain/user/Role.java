package example.org.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    //Role.GUEST.getKey() 하면 "ROLE_GUEST" 반환, Role.TITLE.getTitle()하면 "손님 반환
    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;
}