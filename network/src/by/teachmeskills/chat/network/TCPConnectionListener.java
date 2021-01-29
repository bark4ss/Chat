package by.teachmeskills.chat.network;

public interface TCPConnectionListener {

    void onConnectionReady(TCPConnection tpConnection);
    void onReceiveString(TCPConnection tcpConnection, String msg);
    void onDisconnect(TCPConnection tcpConnection);
    void onException(TCPConnection tcpConnection, Exception ex);
}
