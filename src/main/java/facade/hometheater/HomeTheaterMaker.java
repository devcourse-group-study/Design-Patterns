package facade.hometheater;

import facade.hometheater.subsystem.PopcornPopper;
import facade.hometheater.subsystem.Projector;
import facade.hometheater.subsystem.Screen;
import facade.hometheater.subsystem.TheaterLights;
import facade.hometheater.subsystem.Tuner;

public class HomeTheaterMaker {
	public static HomeTheaterFacade makeFacade() {
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner");
		Projector projector = new Projector("Top-O-Line Projector");
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
		HomeTheaterFacade homeTheater =
				new HomeTheaterFacade(tuner,
						projector, screen, lights, popper);

		return homeTheater;
	}
}
