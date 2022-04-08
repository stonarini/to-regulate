package edu.poniperro.hardware;

import edu.poniperro.interfaces.Heater;
import edu.poniperro.IO.FileIO;

public class Gangsta implements Heater {
    @Override
    public void engage() {
        String temperature = FileIO.readFromFile("temperature.txt");
        intimidate(Integer.valueOf(temperature));
    }

    @Override
    public void disengage() {
        String temperature = FileIO.readFromFile("temperature.txt");
        coolDown(Integer.valueOf(temperature));
    }

    private void intimidate(int temperature) {
        FileIO.writeToFile("temperature.txt", String.valueOf(Integer.valueOf(temperature) + 1));
    }

    private void coolDown(int temperature) {
        FileIO.writeToFile("temperature.txt", String.valueOf(Integer.valueOf(temperature) - 1));
    }

    public void speak() {
        System.out.println(
                "[Intro]\n" +
                        "Regulators. We regulate any stealin' of his property. \n" +
                        "We’re damn good too. But you can’t be any geek off the street. \n" +
                        "You gotta be handy with the steel, if you know what I mean. \n" +
                        "Earn your keep. Regulators, mount up!\n\n" +
                        "[Verse 1: Warren G & Nate Dogg]\n" +
                        "It was a clear black night, a clear white moon\n" +
                        "Warren G was on the streets tryin' to consume\n" +
                        "Some skirts for the eve so I can get some funk\n" +
                        "Rollin' in my ride, chillin' all alone\n" +
                        "Just hit the east side of the LBC\n" +
                        "On a mission tryna find Mr. Warren G\n" +
                        "Seen a car full of girls, ain't no need to tweak\n" +
                        "All you skirts know what's up with 213\n" +
                        "So, I hooks a left on 21 and Lewis\n" +
                        "Some brothers shootin' dice, so I said \"Let's do this!\"\n" +
                        "I jumped out the ride and said \"What's up?\"\n" +
                        "Some brothers pulled some gats, so I said \"I'm stuck!\"\n" +
                        "Since these girls peepin' me I'ma glide and swerve\n" +
                        "These hookers lookin' so hard they straight hit the curb\n" +
                        "Onto bigger, better things than some horny tricks\n" +
                        "I see my homie and some suckas all in his mix\n" +
                        "[Verse 2: Warren G & Nate Dogg]\n" +
                        "I'm gettin' jacked, I'm breakin' myself\n" +
                        "I can't believe they takin' Warren's wealth\n" +
                        "They took my rings, they took my Rolex\n" +
                        "I looked at the brothers, said \"Damn, what's next?\"\n" +
                        "They got my homie hemmed up and they all around\n" +
                        "Can't none of them see him if they goin' straight pound-for-pound\n" +
                        "They wanna come up real quick before they start to clown\n" +
                        "I best pull out my strap and lay them bustas down\n" +
                        "They got guns to my head, I think I'm goin' down\n" +
                        "I can't believe it's happenin' in my own town\n" +
                        "If I had wings I would fly, let me contemplate\n" +
                        "I glanced in the cut and I see my homie Nate\n" +
                        "Sixteen in the clip and one in the hole\n" +
                        "Nate Dogg is about to make some bodies turn cold\n" +
                        "Now they droppin' and yellin', it's a tad bit late\n" +
                        "Nate Dogg and Warren G had to regulate\n" +
                        "\n[Interlude]\n\n" +
                        "[Verse 3: Nate Dogg & Warren G]\n" +
                        "I laid all them bustas down, I let my gat explode\n" +
                        "Now I'm switchin' my mind back into freak mode\n" +
                        "If you want skirts, sit back and observe\n" +
                        "I just left a gang of hoes over there on the curb\n" +
                        "Now, Nate got the freaks and that's a known fact\n" +
                        "Before I got jacked I was on the same track\n" +
                        "Back up, back up, 'cause it's on\n" +
                        "N-A-T-E and me, the Warren to the G\n" +
                        "Just like I thought, they were in the same spot\n" +
                        "In need of some desperate help\n" +
                        "But Nate Dogg and the G child\n" +
                        "Were in need of somethin' else\n" +
                        "One of them dames was sexy as hell\n" +
                        "I said, \"Ooh, I like your size!\"\n" +
                        "She said, \"My car's broke down and you seem real nice\n" +
                        "Would you let me ride?\"\n" +
                        "I got a car full of girls and it's goin' real swell\n" +
                        "The next stop is the Eastside Motel\n" +
                        "\n[Interlude]\n\n" +
                        "[Outro: Warren G & Nate Dogg]\n" +
                        "I'm tweaking into a whole new era\n" +
                        "G-funk, step to this, I dare ya\n" +
                        "Funk on a whole new level\n" +
                        "The rhythm is the bass and the bass is the treble\n" +
                        "Chords, strings, we brings melody, G-funk\n" +
                        "Where rhythm is life and life is rhythm\n" +
                        "If you know like I know, you don't wanna step to this\n" +
                        "It's the G-funk era, funked out with a gangsta twist\n" +
                        "If you smoke like I smoke, then you're high like every day\n" +
                        "And if yo' ass is a busta, 213 will regulate\n");
    }
}
