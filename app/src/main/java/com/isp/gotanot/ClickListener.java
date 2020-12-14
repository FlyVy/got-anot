package com.isp.gotanot;

import android.view.View;

public interface ClickListener<Object> {
    void onClick(View view, Object data, int position);
}
