package com.manulaiko.tabitha.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import java.net.Socket;

import com.manulaiko.tabitha.Console;

/**
 * Connection class
 *
 * This class is used when the server accepts a connection
 *
 * @author Manulaiko <manulaiko@gmail.com>
 *
 * @package com.manulaiko.tabitha.net
 */
public abstract class Connection extends Thread
{
    /**
     * Connection ID
     */
    public int id;

    /**
     * Connection socket
     */
    protected Socket _socket;

    /**
     * Thread object
     */
    protected Thread _thread;

    /**
     * Constructor
     *
     * @param socket Socket connection
     */
    public Connection(Socket socket)
    {
        this._socket = socket;
    }

    /**
     * Closes the socket
     */
    public void close()
    {
        try {
            this._socket.close();
        } catch(IOException e) {
            Console.println("Couldn't close socket!");
            Console.println(e.getMessage());
        }
    }
}
