package ensa.sri.indexationcv.exceptions;

import java.util.Map;

public class EmptyKeywordException extends BaseException{
    public EmptyKeywordException(Map<String, Object> data) {
        super(ErrorCode.EMPTY_KEYWORD, data);
    }
}
