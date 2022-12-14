package esprit.spring.tn.examala.Aspect;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @After("execution(* esprit.spring.tn.examala.Aspect.*.get*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {

        String name = joinPoint.getSignature().getName();

        log.info("méthode exécutée :" + name);
    }
}