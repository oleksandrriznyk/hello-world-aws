package com.smirnov.helloworldaws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorldLambda implements RequestHandler<Object, Object> {


    @Override
    public Object handleRequest(Object input, Context context) {
        System.out.println("Hello World");
        return null;
    }


}
