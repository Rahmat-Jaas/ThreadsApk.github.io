package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C83334rD;
import android.widget.TextView;
import com.facebook.dcp.model.DcpData;
import com.facebook.dcp.model.PredictorMetadata;
import java.util.Iterator;
import java.util.List;

public final class PredictAndLoggerTestFragment$onExecuteButtonClick2$1 implements C83334rD {
    public final /* synthetic */ PredictorMetadata $predictorMetadata;
    public final /* synthetic */ PredictAndLoggerTestFragment this$0;

    public void onFailure(Throwable th) {
        C04220Ms.A0B(th, 0);
        TextView textView = this.this$0.responseText;
        if (textView == null) {
            C04220Ms.A0E("responseText");
            throw null;
        } else {
            textView.setText(AnonymousClass0wJ.A0t("Failed to get prediction results. Detailed Throwable message: ", th));
        }
    }

    public PredictAndLoggerTestFragment$onExecuteButtonClick2$1(PredictAndLoggerTestFragment predictAndLoggerTestFragment, PredictorMetadata predictorMetadata) {
        this.this$0 = predictAndLoggerTestFragment;
        this.$predictorMetadata = predictorMetadata;
    }

    public void onSuccess(List list) {
        TextView textView = this.this$0.responseText;
        if (textView == null) {
            C04220Ms.A0E("responseText");
            throw null;
        }
        textView.setText(AnonymousClass0wJ.A0t("prediction results: ", list));
        if (list != null) {
            PredictAndLoggerTestFragment predictAndLoggerTestFragment = this.this$0;
            PredictorMetadata predictorMetadata = this.$predictorMetadata;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                predictAndLoggerTestFragment.logScore(((DcpData) it.next()).A00, predictorMetadata.A0B, predictorMetadata.A04, predictorMetadata.A0A);
            }
        }
    }
}
