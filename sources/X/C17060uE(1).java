package X;

import java.io.DataOutputStream;
import java.util.List;

/* renamed from: X.0uE  reason: invalid class name and case insensitive filesystem */
public interface C17060uE {
    byte[] convertForegroundStateWithSubscriptionToThriftPayload(String str, Boolean bool, Integer num, List list, List list2);

    List getConnectSubscribeTopics(List list);

    int handleConnectMessage(DataOutputStream dataOutputStream, C14700py r2);
}
