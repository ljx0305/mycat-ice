// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.2
//
// <auto-generated>
//
// Generated from file `myservice.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.my.demo;

public interface MyServicePrx extends Ice.ObjectPrx
{
    public String hellow();

    public String hellow(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_hellow();

    public Ice.AsyncResult begin_hellow(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_hellow(Ice.Callback __cb);

    public Ice.AsyncResult begin_hellow(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_hellow(Callback_MyService_hellow __cb);

    public Ice.AsyncResult begin_hellow(java.util.Map<String, String> __ctx, Callback_MyService_hellow __cb);

    public Ice.AsyncResult begin_hellow(IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_hellow(IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_hellow(java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_hellow(java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb);

    public String end_hellow(Ice.AsyncResult __result);
}
