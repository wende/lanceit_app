// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dailydeals.ui;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.dailydeals.ui:
//            DailyDealsContainer

class this._cls0
    implements android.widget.kListener
{

    final DailyDealsContainer this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        DailyDealsContainer.access$1(DailyDealsContainer.this, i, DailyDealsContainer.access$0(DailyDealsContainer.this));
    }

    stener()
    {
        this$0 = DailyDealsContainer.this;
        super();
    }
}
