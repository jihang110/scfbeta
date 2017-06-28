package com.ut.scf.core.exception;

import com.ut.scf.core.dict.ErrorCodeEnum;

public class SharingResourceOverflowException extends BizException {

	private static final long serialVersionUID = 845732603358628276L;

	public SharingResourceOverflowException() {
		super(ErrorCodeEnum.SHARERESOURCE_OVERFLOW_EXCEPTION);
	}

}
