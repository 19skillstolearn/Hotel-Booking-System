package com.skillstolearn.hotelsearch.captcha;

import com.skillstolearn.hotelsearch.Web.exception.ReCaptchaInvalidException;

public interface ICaptchaService {

	void processResponse(final String response) throws ReCaptchaInvalidException;
    String getReCaptchaSite();
    String getReCaptchaSecret();
}
