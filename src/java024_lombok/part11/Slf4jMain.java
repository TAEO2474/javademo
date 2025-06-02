package java024_lombok.part11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

//lombok의 @Slf4j 를 통해 Logger 객체 생성 없이 바로 log.debug()로 로그를 출력할 수 있다.
@Slf4j
public class Slf4jMain {
	

	public static void main(String[] args) {
		log.trace("trace message"); // trace: debug레벨보다 더 상세한 정보를 표시
		log.debug("debug message"); // debug: 디버깅을 위한 정보를 표시
		log.info("info message"); // info: 정보성 로그를 표시
		log.warn("warn message"); // warn: 시스템 에러의 원인이 될 수 있는 경고성 메시지를 표시
		log.error("error message"); // error: 요청을 처리하는 중 오류가 발생한 경우 표시
	}

}
