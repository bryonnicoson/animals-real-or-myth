package org.codeforcoffee.animalsrealormyth;

/**
 * Created by codeforcoffee on 6/6/16.
 */
public class Animal {

    String mName;
    String mDescription;
    String mLocation;
    String mCorrectMessage;
    String mIncorrectMessage;
    boolean isMythological;

    public Animal() {

    }

    public Animal(String name, String desc, String loc, boolean isMyth) {
        this.mName = name;
        this.mDescription = desc;
        this.mLocation = loc;
        this.isMythological = isMyth || false;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getCorrectMessage() {
        return mCorrectMessage;
    }

    public void setCorrectMessage(String correctMessage) {
        mCorrectMessage = correctMessage;
    }

    public String getIncorrectMessage() {
        return mIncorrectMessage;
    }

    public void setIncorrectMessage(String incorrectMessage) {
        mIncorrectMessage = incorrectMessage;
    }
}
