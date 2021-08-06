package cf.thdisstudio.kbja.bot;

import cf.thdisstudio.kbja.lib;
import org.json.*;

public class Bot {
    JSONObject j;
    public Bot(JSONObject j){
        this.j = j;
    }

    /**
     * 봇의 아이디를 Long 값으로 전달 합니다
     * */
    public long getLongId(){
        long id;
        if(j.has("data") && j.getJSONObject("data").has("data"))
            id = (long) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("id");
        else if(j.has("data"))
            id = (long) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("id");
        else
            id = '0';
        return id;
    }

    /**
    * 봇의 아이디를 String 값으로 전달 합니다
    * */
    public String getStringId(){
        String id;
        if(j.has("data") && j.getJSONObject("data").has("data"))
            id = (String) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("id");
        else if(j.has("data"))
            id = (String) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("id");
        else
            id = null;
        return id;
    }

    public lib getLib(){
        lib Lib;
        if(j.has("data") && j.getJSONObject("data").has("data")) {
            String id = (String) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("id");
            if (id.equals("JDA"))
                Lib = lib.JDA;
            else if (id.equals("Discord4J"))
                Lib = lib.Discord4J;
            else if (id.equals("discord.py"))
                Lib = lib.Discordpy;
            else if (id.equals("discord.js"))
                Lib = lib.Discordjs;
            else if (id.equals("DiscordGo"))
                Lib = lib.Discordgo;
            else if (id.equals("Discord.Net"))
                Lib = lib.Discordnet;
            else
                Lib = lib.etc;
        }
        else if(j.has("data")) {
            String id = (String) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("id");
            if (id.equals("JDA"))
                Lib = lib.JDA;
            else if (id.equals("Discord4J"))
                Lib = lib.Discord4J;
            else if (id.equals("discord.py"))
                Lib = lib.Discordpy;
            else if (id.equals("discord.js"))
                Lib = lib.Discordjs;
            else if (id.equals("DiscordGo"))
                Lib = lib.Discordgo;
            else if (id.equals("Discord.Net"))
                Lib = lib.Discordnet;
            else
                Lib = lib.etc;
        }else
            Lib = null;
        return Lib;
    }

    public String getPrefix(){
        String prefix;
        if(j.has("data") && j.getJSONObject("data").has("data"))
            prefix = (String) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("prefix");
        else if(j.has("data"))
            prefix = (String) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("prefix");
        else
            prefix = null;
        return prefix;
    }

    public int getVotes(){
        int votes;
        if(j.has("data") && j.getJSONObject("data").has("data"))
            votes = (Integer) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("votes");
        else if(j.has("data"))
            votes = (Integer) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("prefix");
        else
            votes = 0;
        return votes;
    }

    public int getServers(){
        int count;
        if(j.has("data") && j.getJSONObject("data").has("data"))
            count = (Integer) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("servers");
        else if(j.has("data"))
            count = (Integer) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("servers");
        else
            count = 0;
        return count;
    }

    public String getWebpage(){
        String url;
        if(j.has("data") && j.getJSONObject("data").has("data"))
            url = (String) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("web");
        else if(j.has("data"))
            url = (String) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("web");
        else
            url = null;
        return url;
    }

    public String getGithub(){
        String url;
        if(j.has("data") && j.getJSONObject("data").has("data"))
            url = (String) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("git");
        else if(j.has("data"))
            url = (String) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("git");
        else
            url = null;
        return url;
    }

    public String getName(){
        String name;
        if(j.has("data") && j.getJSONObject("data").has("data"))
            name = (String) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("name");
        else if(j.has("data"))
            name = (String) j.getJSONObject("data").getJSONArray("data").getJSONObject(1).get("name");
        else
            name = null;
        return name;
    }
}
