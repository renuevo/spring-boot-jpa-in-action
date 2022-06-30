package com.github.renuevo.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.domain.AuditorAware
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import java.util.*

@Configuration
@EnableJpaAuditing
class AuditorAwareConfig : AuditorAware<String> {

  override fun getCurrentAuditor(): Optional<String> = Optional.of("테스트 생생자")

}
