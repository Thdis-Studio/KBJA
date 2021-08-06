package cf.thdisstudio.kbja.data;

public class Data {
    public String token;
    public boolean UpdateWhenSend = false;

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isUpdateWhenSend() {
        return UpdateWhenSend;
    }

    public void setUpdateWhenSend(boolean updateWhenSend) {
        this.UpdateWhenSend = updateWhenSend;
    }

    public String getToken() {
        return token;
    }
}
