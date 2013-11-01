package com.luver.random;

public interface CallbackClient<Result> {
    void registerCallback(Callback<Result> callback);
}
