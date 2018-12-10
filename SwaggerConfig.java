package com.hcsc.claim.planlevelsettings.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hcsc.claim.common.AbstractSwaggerConfig;
import com.hcsc.claim.planlevelsettings.BdmPlanLevelSettingsApplication;

import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author I375038
 * Swaggerconfiguration to enable swagger for BDM service
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends AbstractSwaggerConfig {

  /* (non-Javadoc)
   * @see com.hcsc.keystone.accums.common.components.AbstractSwaggerConfig#getBasePackageName()
   */
  @Override
  public String getBasePackageName() {
    //return the SpringBootInitializer class name
    return BdmPlanLevelSettingsApplication.class.getPackage().getName();
  }

  /**
   * @return UiConfiguration
   */
  @Bean
  UiConfiguration uiConfig() {
    return new UiConfiguration(null, // url
        "none", // docExpansion => none | list
        "alpha", // apiSorter => alpha
        "schema", // defaultModelRendering => schema
        UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, false, // enableJsonEditor  => true | false
        true, // showRequestHeaders => true | false
        60000L); // requestTimeout => in milliseconds, defaults to null
    // (uses jquery xh timeout)
  }
}
