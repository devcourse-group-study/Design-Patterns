package facade.hometheater;

import facade.hometheater.subsystem.PopcornPopper;
import facade.hometheater.subsystem.Projector;
import facade.hometheater.subsystem.Screen;
import facade.hometheater.subsystem.TheaterLights;
import facade.hometheater.subsystem.Tuner;

public class HomeTheaterFacade {
	Tuner tuner;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
 
	public HomeTheaterFacade(
				 Tuner tuner,
				 Projector projector, 
				 Screen screen,
				 TheaterLights lights,
				 PopcornPopper popper) {

		this.tuner = tuner;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}
 
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
	}
 
 
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
	}
}
