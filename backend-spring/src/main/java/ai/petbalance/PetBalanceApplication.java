package ai.petbalance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * petbalance 백엔드 — Spring Boot 포트.
 *
 * 원본 FastAPI 백엔드({@code backend/} 디렉터리, Python)를 마이그레이션한 것으로,
 * 핵심 분석 로직(단위 환산, 성분명 정규화, 섭취량 합산·상태 판정, 계정 인증, 카탈로그)을
 * 우선 이식했다. 전체 대응 범위는 backend-spring/README.md 를 참고.
 */
@SpringBootApplication
public class PetBalanceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PetBalanceApplication.class, args);
    }
}
